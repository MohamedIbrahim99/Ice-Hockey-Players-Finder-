package eg.edu.alexu.csd.datastructure.iceHockey.cs22;

import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;

public class playersFinder implements IPlayersFinder {

	static int counter = 0 ;
	int max_i , max_j , min_i , min_j ;

		// Sort the points
    static class sort_points implements Comparator<Point> {
        public int compare(Point o1, Point o2) {
            return o1.x - o2.x;
        }
    }

		// Recursion Function
		// Search if there is continuous pixles has the same team color
	public void continuousSearch(int i , int j , String[] photo, int team) {
		
        char chTeam = (char) (team + '0');  //change team from int to char

		if ( photo[i].charAt(j) == chTeam) {
			counter++;
			photo[i] = photo[i].substring(0,j)+'x'+photo[i].substring(j+1,photo[i].length());
			if (max_i < i) {
				max_i = i;
			}
			if (max_j < j) {
				max_j = j;
			}
			if (min_i > i*2) {
				min_i = i*2;
			}
			if (min_j > j*2) {
				min_j = j*2;
			}
			if (j < photo[0].length()-1 ) {
				continuousSearch(i, j+1, photo, team);
			}
			if (i < photo.length-1 ) {
				continuousSearch(i+1, j, photo, team);
			}
			if (j > 0 && i < photo.length ) {
				continuousSearch(i, j-1, photo, team);
			}
		}
		else {
			// Do nothing
		}
	}
		



	@Override
	public Point[] findPlayers(String[] photo, int team, int threshold) {
		
			// If the image is Empty-null
        if (photo.length == 0) {
            return null;
        }
        
		int minBoxes ;
		if ( threshold %2 == 0) {
			minBoxes =  threshold / 4 ;
		}
		else {
			minBoxes =  threshold / 4 +1 ;
		}
		int count = 0;
        char chTeam = (char) (team + '0');  //change team from int to char
        // Points
	    Point[] points = new Point[30];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }
	    
		for (int i = 0 ; i < photo.length  ; i++) {
			for (int j = 0 ; j < photo[0].length() ; j++) {
				if (  photo[i].charAt(j) == chTeam ) {
	
					counter = 0 ;
					min_i = i*2;
					min_j = j*2;
					max_i = 0 ;
					max_j = 0 ;
					
					continuousSearch(i, j, photo, team);

					
					
					
					if (counter >= minBoxes) {
						// Find the centre point

				        points[count].setLocation(((max_j*2+2) - min_j )/2 + min_j , ((max_i*2+2) - min_i )/2 + min_i);   
						count++;
					}
					
				}	
			}
		}

		Arrays.sort(points,0,count,new sort_points());
        Point[] p=new Point[count];
        System.arraycopy(points,0,p,0,count);

        return  p;
	}

}
