package dataStructures.javaComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] player = new Player[n];
        Checker checker = new Checker();
        for (int i = 0; i < n; i++) {
            player[i] = new Player(sc.next(), sc.nextInt());
        }
        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i].name + " " + player[i].score);
        }

    }

}

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score < b.score) {
            return 1;
        } else if (a.score > b.score) {
            return -1;
        } else {
            return a.name.compareTo(a.name);
        }
    }
}
