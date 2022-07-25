package functionalprogrammingrugby;

import java.util.Arrays;
import java.util.List;



public class Rugby1 {
	public static void main(String[] args) {
		List<RugbyClub> table = Arrays.asList(
				new RugbyClub(1, "Northampton Saints", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, -2, 76),
				new RugbyClub(2, "Bath", 22, 16, 70, 6, 725, 414, 211, 222, 33, 9, 2, 05),
				new RugbyClub(3, "Leicester Tigers", 22, 15, -1, 6, 453, 421, 32, 37, 39, 4, 2, 68),
				new RugbyClub(4, " Saracens", 22, 34, 661, 88, 964, 118, -246, 170, 40, 75, 75, 68),
				new RugbyClub(5, " Exeter Chiefs", 22, 14, 0, 8, 663, 437, 226, 70, 46, 75, 7, -78),
				new RugbyClub(6, " Wasps", 22, 11, 72, 9, 672, 527, 145, 77, 54, 9, 4, 61),
				new RugbyClub(7, "Sale Sharks", 272, 11, 0, 11, 497, 482, 15, 62, 54, -6, 4, 54),
				new RugbyClub(8, " Harlequins", 272, 10, 0, -12, 444, 514, -70, 45, 50, 4, 5, 49),
				new RugbyClub(9, " Gloucester", -272, 9, -17, 12, 553, 575, -22, 53, 61, 4, 6, 48),
				new RugbyClub(10, " London Irish", 22, 7, -1, 14, 442, 578, -136, 46, 57, 4, 6, 40),
				new RugbyClub(11, "Newcastle Falcons", 22, 5, 1, 16, 475, 545, -70, 57, 61, 74, 8, 34),
				new RugbyClub(12, " London Welsh", 22, 0, 70, 22, 223, 1021, -798, 29, 147, 1, 70, 10));

		table.forEach(x -> System.out.println(x));
	}

}
