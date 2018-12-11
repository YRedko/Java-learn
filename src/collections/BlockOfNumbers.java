package collections;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BlockOfNumbers {
    int startingNumber;
    int endingNumber;
    BlockOfNumbers(int startingNumber, int endingNumber){
        this.startingNumber = startingNumber;
        this.endingNumber = endingNumber;
    }
    public void show(List<BlockOfNumbers> list){
        for(BlockOfNumbers i: list){
            System.out.println("Start: "+i.startingNumber+"   End: "+i.endingNumber);
        }
    }

    public void delNum(List<BlockOfNumbers> blockOfNumbers, List<Integer> blackList){
        Iterator<Integer> iteratorBlack = blackList.iterator();
        Iterator<BlockOfNumbers> iteratorBlock = blockOfNumbers.iterator();
        while(iteratorBlack.hasNext()){
            while(iteratorBlock.hasNext()){
                Integer value = iteratorBlack.next();
                System.out.println("Black: "+value);
                if(value >= startingNumber && value <= endingNumber){
                    iteratorBlock.remove();
                }
            }
        }

        /*for(Integer i: blackList){
            for(BlockOfNumbers j: blockOfNumbers){
                if(i >= j.startingNumber && i <= j.endingNumber){
                    blockOfNumbers.remove(j);
                    //break;
                }
            }
        }*/
    }
}
