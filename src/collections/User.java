package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class User {
    String fullName;
    int age;
    Set<User> Friends;

    User(String fullName){
        this.fullName = fullName;
    }

    public void showFriendsOfFriends(){
        Set<?> set = this.Friends;
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            User userFriend = (User) iterator.next();
            Iterator iteratorUserFriend = userFriend.Friends.iterator();
            while(iteratorUserFriend.hasNext()){
                User friendsOfFriends = (User) iteratorUserFriend.next();
                System.out.println("Friends of friends: "+friendsOfFriends.fullName);
            }
        }
    }
}
