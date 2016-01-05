import org.junit.Test;

public class TestBST extends TestCase{
   private BST bst;
   
   public void setUp(){
      bst = new BST();
   }
   
   public void testAdd(){
      bst.insert(new integer(8));
      bst.insert(new integer(3));
      bst.insert(new integer(1));
      bst.insert(new integer(6)); 
      bst.insert(new integer(4));
      bst.insert(new integer(7));
      bst.insert(new integer(10));
      bst.insert(new integer(14));
      bst.insert(new integer(13));
      bst.insert(new integer(13));

      bst.preOrderTraversal();
      assertEquals("8 3 1 6 4 7 10 14 13", systemOut().getHistory());
      systemOut().clearHistory();

      bst.inOrderTraversal();
      assertEquals("1 3 4 6 7 8 10 13 14", systemOut().getHistory());
      systemOut().clearHistory();
        
     bst.postOrderTraversal()
        assertEquals("1 4 7 6 3 13 14 10 8", systemOut().getHistory());
         systemOut().clearHistory();
   }
   
public bool testsearch(){

int r;  
bst.insert(new integer(2));
  bst.insert(new integer(6));
  bst.insert(new integer(9)); 
  bst.insert(new integer(4));
  
assertEquals("1" ,bst.search(new integer(9));
systemOut.clearHistory();

}   

public void testRemove(){
 
     bst.insert(new Integer(10));
      bst.insert(new Integer(8));
      bst.insert(new Integer(9));
      bst.insert(new Integer(6));
      bst.insert(new Integer(7));
      bst.delete(new Integer(6));
      systemOut().clearHistory();
      bst.inOrderTraversal();
      assertEquals("7 8 9 10", systemOut().getHistory());
   }
}