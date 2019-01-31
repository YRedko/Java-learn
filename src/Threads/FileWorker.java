package Threads;

import java.io.*;

public class FileWorker implements Runnable{

    static String fileName;
    Node root;

    FileWorker(String fileName, Node root){
        this.fileName = fileName;
        this.root = root;
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    public void  writeToFile(String fileName, String text){
        File file =new File(fileName);
        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст в файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static String read(String fileName) throws FileNotFoundException {
//        //Этот спец. объект для построения строки
//        StringBuilder sb = new StringBuilder();
//
//        exists(fileName);
//
//        try {
//            //Объект для чтения файла в буфер
//            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
//            try {
//                //В цикле построчно считываем файл
//                String s;
//                while ((s = in.readLine()) != null) {
//                    sb.append(s);
//                    sb.append("\n");
//                }
//            } finally {
//                //Также не забываем закрыть файл
//                in.close();
//            }
//        } catch(IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        //Возвращаем полученный текст с файла
//        return sb.toString();
//    }
//
//    public static void update(String nameFile, String newText) throws FileNotFoundException {
//        exists(fileName);
//        StringBuilder sb = new StringBuilder();
//        String oldFile = read(nameFile);
//        sb.append(oldFile);
//        sb.append(newText);
//        writeToFile(fileName, sb.toString());
//    }

    public void recursionBinaryTree(Node node, StringBuilder sb){
        System.out.println(node.label);
        sb.append(node.label);

        if (node.left!=null) {
//            writeToFile(fileName, node.label);
            recursionBinaryTree(node.left, sb);
        }
        if (node.right!=null) {
            //writeToFile(fileName, node.label);
//            System.out.println("right: "+node.label);
//            sb.append(node.label);
            recursionBinaryTree(node.right, sb);
        }

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        StringBuilder sb = new StringBuilder();
        recursionBinaryTree(root, sb);
        writeToFile(fileName, sb.toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
