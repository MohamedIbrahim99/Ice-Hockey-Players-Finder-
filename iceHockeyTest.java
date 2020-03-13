package eg.edu.alexu.csd.datastructure.iceHockey.cs22;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.Test;

class iceHockeyTest {

	@Test
	void test1() {
		playersFinder p = new playersFinder();
        String[] photo={
        		"33JUBU33",
        		"3U3O4433",
        		"O33P44NB",
        		"PO3NSDP3",
        		"VNDSD333",
        		"OINFD33X"
        };
	
        java.awt.Point[] arr=p.findPlayers(photo,3,16);
        
        	// The Excepected Points
        Point[]ans=new Point[3];
        for(int i = 0; i < ans.length; i++) {
        	
            ans[i] = new Point();
            
        }
        ans[0].setLocation(4,5);
        ans[1].setLocation(13,9);
        ans[2].setLocation(14,2);

        assertArrayEquals(arr,ans);
        
	}

	@Test
	void test2() {
		playersFinder p = new playersFinder();
        String[] photo={
        		"44444H44S4",
        		"K444K4L444",
        		"4LJ44T44XH",
        		"444O4VIF44",
        		"44C4D4U444",
        		"4V4Y4KB4M4",
        		"G4W4HP4O4W",
        		"4444ZDQ4S4",
        		"4BR4Y4A444",
        		"4G4V4T4444"
        };
		
	
        java.awt.Point[] arr=p.findPlayers(photo,4,16);
        
    	// The Excepected Points
    Point[]ans=new Point[6];
    for(int i = 0; i < ans.length; i++) {
    	
        ans[i] = new Point();
        
    }
    ans[0].setLocation(3,8);
    ans[1].setLocation(4,16);
    ans[2].setLocation(5,4);
    ans[3].setLocation(16,3);
    ans[4].setLocation(16,17);
    ans[5].setLocation(17,9);
    
    assertArrayEquals(arr,ans);
        
	}
	
	@Test
	void test3() {
		playersFinder p = new playersFinder();
        String[] photo={
        		"8D88888J8L8E888",
        		"88NKMG8N8E8JI88",
        		"888NS8EU88HN8EO",
        		"LUQ888A8TH8OIH8",
        		"888QJ88R8SG88TY",
        		"88ZQV88B88OUZ8O",
        		"FQ88WF8Q8GG88B8",
        		"8S888HGSB8FT8S8",
        		"8MX88D88888T8K8",
        		"8S8A88MGVDG8XK8",
        		"M88S8B8I8M88J8N",
        		"8W88X88ZT8KA8I8",
        		"88SQGB8I8J88W88",
        		"U88H8NI8CZB88B8",
        		"8PK8H8T8888TQR8"
        };
		
	
        java.awt.Point[] arr=p.findPlayers(photo,8,9);
        
    	// The Excepected Points
    Point[]ans=new Point[19];
    for(int i = 0; i < ans.length; i++) {
    	
        ans[i] = new Point();
        
    }
    ans[0].setLocation(1,17);
    ans[1].setLocation(3,3);
    ans[2].setLocation(3,10);
    ans[3].setLocation(3,25);
    ans[4].setLocation(5,21);
    ans[5].setLocation(8,17);
    ans[6].setLocation(9,2);
    ans[7].setLocation(10,9);
    ans[8].setLocation(12,23);
    ans[9].setLocation(17,16);
    ans[10].setLocation(18,3);
    ans[11].setLocation(18,11);
    ans[12].setLocation(18,28);
    ans[13].setLocation(22,20);
    ans[14].setLocation(23,26);
    ans[15].setLocation(24,15);
    ans[16].setLocation(27,2);
    ans[17].setLocation(28,26);
    ans[18].setLocation(29,16);

    assertArrayEquals(arr,ans);
        
	}
	
	@Test
	void test4() {
		playersFinder p = new playersFinder();
        String[] photo={
        		"11111",
        		"1AAA1",
        		"1A1A1",
        		"1AAA1",
        		"11111"
        };
		
	
        java.awt.Point[] arr=p.findPlayers(photo,1,3);
        
    	// The Excepected Points
    Point[]ans=new Point[2];
    for(int i = 0; i < ans.length; i++) {
    	
        ans[i] = new Point();
        
    }
    ans[0].setLocation(5,5);
    ans[1].setLocation(5,5);
    
    assertArrayEquals(arr,ans);
        
	}
	
	
	
		// Empty-null image test
	@Test
	void test5_emptyImage() {
		
		playersFinder p = new playersFinder();
	    String[] photo={};
	    
	    java.awt.Point[] arr=p.findPlayers(photo,1,3);
	   
	    
        assertArrayEquals(arr,null);
	    
	}
	

}
