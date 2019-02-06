package Threads;

import java.io.*;

public class FileWorker implements Runnable{

    static String fileName;
    Tree tree;
    static volatile int counter;

    FileWorker(String fileName, Tree tree){
        this.fileName = fileName;
        this.tree = tree;
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    public static void  writeToFile(String fileName, String text){
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

    public static String read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();

        File file =new File(fileName);

        exists(fileName);

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    public static void update(String nameFile, String newText) throws FileNotFoundException {
        exists(fileName);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(newText+"----------"+"\n");
        writeToFile(nameFile, sb.toString());
    }

/*    public void recursionBinaryTree(Node node, StringBuilder sb){
        System.out.print(node.label);
        sb.append(node.label);

        if (node.left!=null) {
            recursionBinaryTree(node.left, sb);
        }
        if (node.right!=null) {
            recursionBinaryTree(node.right, sb);
        }

    }*/
    public void recursionBinaryTree(Node node, StringBuilder sb){
        System.out.println();
        sb.append(node.label2);

        if (node.left!=null) {
            recursionBinaryTree(node.left, sb);
        }
        if (node.right!=null) {
            recursionBinaryTree(node.right, sb);
        }
    }

    @Override
    public void run() {
        //writeToFile(fileName, sb.toString());

        StringBuilder sb = new StringBuilder();

        while(counter < 3){
            System.out.println(counter);
            recursionBinaryTree(tree.root, sb);
            try {
                update(fileName,sb.toString());
                System.out.println("--------"+sb.toString());

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            sb.delete(0,sb.length());

        }

        System.out.println();
        try {
            recursionBinaryTree(tree.root, sb);
            update(fileName,sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
