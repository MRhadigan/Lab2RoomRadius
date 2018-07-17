import java.util.Scanner;

public class RoomRadius {

	public static void main(String[] args) {
		double roomLength;
		double roomWidth;
		double roomHeight;
		double roomArea;
		double roomPerimeter;
		double roomVolume;
		
		boolean continueGame;
		
		// input for length
		System.out.println("Please enter the length of the classroom:");
		Scanner scan = new Scanner(System.in);
		roomLength = scan.nextDouble();

		//input for width
		System.out.println("Please enter the width of the classroom:");
		roomWidth = scan.nextDouble();
		
		//input for height
		System.out.println("Please enter the height of the classroom:");
		roomHeight = scan.nextDouble();

		//equation for area
		roomArea = roomLength * roomWidth;
		System.out.println("The area of the classroom is: " + roomArea);

		// equation for perimeter
		roomPerimeter = roomWidth + roomWidth + roomLength + roomLength; 
		System.out.println("The perimeter of the classroom is: " + roomPerimeter); 

		//equation for volume
		roomVolume = roomWidth * roomHeight * roomLength; 
		System.out.println("The volume of the classroom is: " + roomVolume);
		
		System.out.println("Continue (y/n):");
		continueGame = scan.hasNext();
		
		
		if (continueGame) {
			System.out.println("Please enter the length of the classroom:");
			Scanner scan1 = new Scanner(System.in);
			roomLength = scan1.nextDouble();
			
			System.out.println("Please enter the width of the classroom:");
			roomWidth = scan1.nextDouble();

			System.out.println("Please enter the height of the classroom:");
			roomHeight = scan1.nextDouble();
			
			roomArea = roomLength * roomWidth; 
			System.out.println("The area of the classroom is: " + roomArea);

			roomPerimeter = roomWidth + roomWidth + roomLength + roomLength;
			System.out.println("The perimeter of the classroom is: " + roomPerimeter);

			roomVolume = roomWidth * roomHeight * roomLength;
			System.out.println("The volume of the classroom is: " + roomVolume);
			
			System.out.println("Continue (y/n):");
			continueGame = scan1.hasNext();
		}
		else {
		}
	

	}

}
