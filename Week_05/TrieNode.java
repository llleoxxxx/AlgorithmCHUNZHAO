class TrieNode{//关键要定义好TrieNode类
    char c;//定义某一节点的值
    HashMap<Character, TrieNode> children = new HashMap<>();//建立哈希键-值对
    boolean isWord = false; //判断是否完整单词
    public TrieNode(char c){
        this.c = c;
    }
    public TrieNode(){}
}


class Trie {
    private TrieNode root;//定义根节点

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();//实现根节点
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        HashMap<Character, TrieNode> child = root.children;//把根节点的子节点全部存入哈希表
        for(int i =0; i< word.length(); i++){
            char c = word.charAt(i);
            TrieNode next;
            if(child.containsKey(c)){
                next=child.get(c);//如果根节点含有此字符，则访问此节点
            }else{
                next = new TrieNode(c);
                child.put(c,next);//若根节点不含此字符，则插入字符并生成新节点
            }
            child = next.children;//更新哈希表为此节点的所有子节点
            if(i==word.length()-1){
                next.isWord=true;//若到达字符串最后一个字则判断为true
            }
        }
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode t = searchNode(word);
        if(t!=null&&t.isWord==true){
            return true;
        }else{
            return false;
        }
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(searchNode(prefix)!=null){
            return true;
        }else{
            return false;
        }
    }

    public TrieNode searchNode(String str){
        HashMap<Character, TrieNode>children = root.children;
        TrieNode cur = null;//先让指针节点置null
        for(int i = 0; i<str.length(); i++){//跟插入很像
            char c = str.charAt(i);
            if(children.containsKey(c)){
                cur=children.get(c);
                children=cur.children;
            }else{
                return null;
            }
        }
        return cur;//最终返回字符串的最后一个字符所在的节点
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

