package trie;

public class Trie {

    char c;
    Trie[] children;
    boolean word;

    public Trie(){
        this.c = 0;
        this.children = new Trie[26];
    }

    public void add(String s){
        if(s.isEmpty()){
            this.word = true;
        }

        char letter = s.charAt(0);
        int index = letter - 'a'; //'a' value of 97

        if(this.children[index] == null){
            this.children[index] = new Trie();
        }
        this.children[index].add(s.substring(1));
    }
}
