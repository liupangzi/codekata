import java.util.*;

public class Twitter {
    class Tweet {
        int id;
        int priority;
        Tweet next;

        Tweet(int id, int priority) {
            this.id = id;
            this.priority = priority;
            next = null;
        }
    }

    private HashMap<Integer, Tweet> store = new HashMap<>();
    private HashMap<Integer, HashSet<Integer>> follow = new HashMap<>();
    private int counter = 0;

    public Twitter() {
    }

    public void postTweet(int userId, int tweetId) {
        if (!store.containsKey(userId)) store.put(userId, null);
        if (!follow.containsKey(userId)) follow.put(userId, new HashSet<>(Collections.singletonList(userId)));

        Tweet tmp = new Tweet(tweetId, counter++);
        tmp.next = store.get(userId);
        store.put(userId, tmp);
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> queue = new PriorityQueue<>((n1, n2) -> n2.priority - n1.priority);

        for (int id : follow.getOrDefault(userId, new HashSet<>())) {
            if (store.containsKey(id)) queue.offer(store.get(id));
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (result.size() < 10 && !queue.isEmpty()) {
            Tweet tweet = queue.remove();
            if (tweet != null) {
                result.add(tweet.id);
                if (tweet.next != null) queue.offer(tweet.next);
            }
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {
        if (!follow.containsKey(followerId)) {
            follow.put(followerId, new HashSet<>(Collections.singletonList(followerId)));
        }
        follow.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followeeId != followerId) {
            follow.getOrDefault(followerId, new HashSet<>(Collections.singletonList(followerId))).remove(followeeId);
        }
    }
}
