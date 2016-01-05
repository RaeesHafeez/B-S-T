import org.junit.Test;

public class TestBST extends TestCase{
   private BST bst;
   
   public void setUp(){
      bst = new BST();
   }
   
   public void testAdd(){
      bst.insert(8);
      bst.insert(3);
      bst.insert(1);
      bst.insert(6); 
      bst.insert(4);
      bst.insert(7);
      bst.insert(10);
      bst.insert(14);
      bst.insert(13);
      bst.insert(13);
      bst.preOrderTraversal();
      assertEquals("8 3 1 6 4 7 10 14 13", systemOut().getHistory());
      systemOut().clearHistory();
      bst.inOrderTraversal();
      assertEquals("1 3 4 6 7 8 10 13 14", systemOut().getHistory());
     bst.postOrderTraversal("1 4 7 6 3 13 14 10 8", systemOut().getHistory());

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
      assertFuzzyEquals("7 8 9 10", systemOut().getHistory());
   }
}