/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inArraySlots list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list:" + list);

        // /* Populate the list with elements, but with a small enough
           // number that we expect no invocation of expand().
        // */
        // System.out.println(list.length + "length");
        int i = 0;
        for( ; i < 5; i++ ) {
            list.add( -i); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list);

        // Add enough elements that expansion is expected
        for( ; i < 15; i++ ) {

            if( i == 10) System.out.println( "expansion expected");

            list.add( -i);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list);

        // Trust no one.
        for( ; i < 35; i++ )
            list.add( -i);
        System.out.println("after second expansion: " + list.size() + " elements:");
        System.out.println( list);

        // --------- end of "code that worked in v0" ---------

        // test accessor
        System.out.println( "sample elements from list:");
        for( int elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }

// -------------------------------------------
     // Local method and invocations of it to...
        // test set
        setTest(8, list);
        setTest(16, list);
        System.out.println();

<<<<<<< HEAD
        //test adding at a specified position
        addAtTest( 0, 29, list); // beginning of the list

        // end of the list using the new add method
        addAtTest( list.size(), 17, list);

=======
        // test adding at a specified position
        addAtTest( 0, 29, list); // beginning of the list
        
        // end of the list using the new add method
        addAtTest( list.size(), 17, list);
        
>>>>>>> 192d5261573ae4b24ec8f873418422f85cce37d2
        addAtTest( 2, 19, list); // middle of a small list

        // force an expansion
        addAtTest( 2, 23, list);
        addAtTest( 2, 23, list);
        addAtTest( 2, 23, list);
        // test removing an element
        System.out.println("removing value " + list.remove( 6)
                          + ", leaving " + list.size() + " elements:");
        System.out.println( list);
        System.out.println(
            "expecting:" + System.lineSeparator()
          + "[29,0,23,23,23,19, NO -1 HERE! -2,-3...]");

    }
//
//     /**
//       Test the set() method, reporting and
//       changing the value at index @modifyAt.
//      */
    private static void setTest( int modifyAt,
                                 List_inArraySlots list
                              ) {
        System.out.println(
            "changed element " + modifyAt + " from "
          + list.set( modifyAt, modifyAt + 1000) + " to "
          + list.get( modifyAt)
          );
     }
//

    /**
      Test the 2-argument add( index, value) method.
     */
    private static void addAtTest( int addAt
                                 , int value
                                 , List_inArraySlots list
                                 ) {
        list.add( addAt, value);
        System.out.println(
            "insert " + value
          + " at position " + addAt
          + ", resulting in "  + list.size() + " elements:"
          + System.lineSeparator()
          + list
          + System.lineSeparator()
        );
    }
//
//


}
