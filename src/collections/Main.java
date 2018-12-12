package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Subscriber subscriber1 = new Subscriber(21);
        Subscriber subscriber2 = new Subscriber(10);
        Subscriber subscriber3 = new Subscriber(10);
        Subscriber subscriber4 = new Subscriber(24);

        Set<Subscriber> set1 = new HashSet<>();
        set1.add(subscriber1);
        set1.add(subscriber2);

        Set<Subscriber> set2 = new HashSet<>();
        set2.add(subscriber3);
        set2.add(subscriber4);*/

//        subscriber1.union(set1, set2);
//        subscriber1.intersection(set1, set2);
//        subscriber1.difference(set1,set2);
//        subscriber1.symmetricDifference(set1, set2);

//////////////////////////////////////////////////////////////////

        /*List<BlockOfNumbers> blockOfNumbers = new ArrayList<>();
        BlockOfNumbers block1 = new BlockOfNumbers(10, 20);
        BlockOfNumbers block2 = new BlockOfNumbers(25, 30);
        blockOfNumbers.add(block1);
        blockOfNumbers.add(block2);

        List<Integer> blackList = new ArrayList<>();
        blackList.add(10);

        block1.show(blockOfNumbers);
        block1.delNum(blockOfNumbers, blackList);
        System.out.println("-----");
        block2.show(blockOfNumbers);*/

//////////////////////////////////////////////////////////////////

        User mainUser = new User("Main");
        User usersFriend = new User("Friend");
        User friendsFriend = new User("Friend of friend");

        Set<User> userSet = new HashSet<>();
        mainUser.Friends = userSet;
        userSet.add(usersFriend);

        Set<User> friendSet = new HashSet<>();
        usersFriend.Friends = friendSet;
        friendSet.add(friendsFriend);

        mainUser.showFriendsOfFriends();

    }

}
