
public class ArrayApp {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0]="lee";
		users[1]="han";
		users[2]="jung";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores= {80, 75, 95};
		System.out.println(scores[1]);
		System.out.println(scores.length);
		
		for(int i=0; i<3; i++) {
			System.out.println(users[i]);
		}

	}

}
