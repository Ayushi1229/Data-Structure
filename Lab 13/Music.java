import java.util.Scanner;

class MusicPlayer {
    MusicNode head;
    MusicNode last;
    MusicNode curr;

    public MusicPlayer() {
        head = last = curr = null; 
    }

    public void addSong(String name) {
        MusicNode n = new MusicNode(name); 
        if (head == null) { 
            head = last = curr = n;
        } else {
            last.next = n;
            n.prev = last;
            last = n;
        }
    }

    public void deleteSong(String name) {
        if (head == null) { 
            System.out.println("Music Player is Empty");
            return;
        }
        if (head.name.equals(name)) {
            if (last == head) { 
                head = last = curr = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }
        MusicNode prevNode = head; 
        MusicNode temp = prevNode.next;

        while (temp != null) {
            if (temp.name.equals(name)) {
                prevNode.next = temp.next; 
                if (temp == last) { 
                    last = prevNode;
                    return;
                }
                if (prevNode.next != null) {
                    prevNode.next.prev = temp.prev;
                }
                return;
            }
            prevNode = temp;
            temp = temp.next;
        }

        System.out.println("Song Not Found");
    }

    public void playSong() {
        if (head == null) { 
            System.out.println("Can't play song because music player is empty");
            return;
        }
        System.out.println("Playing " + curr.name + " song");

        String nextSong = (curr.next == null) ? head.name : curr.next.name;
        String prevSong = (curr.prev == null) ? last.name : curr.prev.name;
        System.out.println("Previous Song : " + prevSong);
        System.out.println("Next Song : " + nextSong);
    }

    public void nextSong() {
        if (head == null) { 
            System.out.println("Can't play song because music player is empty");
            return;
        }
        if (curr == last) curr = head; 
        else curr = curr.next; 
        System.out.println("Playing " + curr.name + " song");

        String nextSong = (curr.next == null) ? head.name : curr.next.name;
        String prevSong = (curr.prev == null) ? last.name : curr.prev.name;
        System.out.println("Previous Song : " + prevSong);
        System.out.println("Next Song : " + nextSong);
    }

    public void prevSong() {
        if (head == null) {
            System.out.println("Can't play song because music player is empty");
            return;
        }
        if (curr == head) curr = last; 
        else curr = curr.prev; 
        System.out.println("Playing " + curr.name + " song");

        String nextSong = (curr.next == null) ? head.name : curr.next.name;
        String prevSong = (curr.prev == null) ? last.name : curr.prev.name;
        System.out.println("Previous Song : " + prevSong);
        System.out.println("Next Song : " + nextSong);
    }

    public void searchSong(String name) {
        if (head == null) { 
            System.out.println("Music player is Empty");
            return;
        }
        MusicNode temp = head; 
        Scanner sc = new Scanner(System.in);

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Song Found");
                System.out.println("Enter 1 to play the song");
                int x = sc.nextInt();
                if (x == 1) {
                    curr = temp; 
                    playSong();
                }
                return;
            }
            temp = temp.next; 
        }
        System.out.println("Song Not Found");
    }

    public void display() {
        if (head == null) {
            System.out.println("Music player is Empty");
            return;
        }
        MusicNode temp = head;
        System.out.println("Displaying all songs:");

        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }
}

class MusicNode {
    String name; 
    MusicNode next; 
    MusicNode prev; 

    public MusicNode() {
        this.name = "";
        this.next = null;
        this.prev = null;
    }

    public MusicNode(String name) {
        this();
        this.name = name;
    }
}

public class Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        MusicPlayer mp = new MusicPlayer(); 
        int x = 1; 
        String song; 

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter 1 to add a song");
            System.out.println("Enter 2 to delete a song");
            System.out.println("Enter 3 to play the current song");
            System.out.println("Enter 4 to play the previous song");
            System.out.println("Enter 5 to play the next song");
            System.out.println("Enter 6 to search for a song");
            System.out.println("Enter 7 to display all songs");
            System.out.println("Enter 8 to exit");

            x = sc.nextInt();
            sc.nextLine();  // Handle the newline character

            switch (x) {
                case 1:
                    System.out.println("Add Song");
                    System.out.println("Enter song name: ");
                    song = sc.nextLine();  // Handle multi-word song names
                    mp.addSong(song);
                    break;

                case 2:
                    System.out.println("Delete Song");
                    System.out.println("Enter song name: ");
                    song = sc.nextLine();  // Handle multi-word song names
                    mp.deleteSong(song);
                    break;

                case 3:
                    mp.playSong();
                    break;

                case 4:
                    mp.prevSong();
                    break;

                case 5:
                    mp.nextSong();
                    break;

                case 6:
                    System.out.println("Search Song");
                    System.out.println("Enter song name: ");
                    song = sc.nextLine();  // Handle multi-word song names
                    mp.searchSong(song);
                    break;

                case 7:
                    mp.display();
                    break;

                case 8:
                    System.out.println("Exiting music player...");
                    return;  // Exit the program

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }
}
