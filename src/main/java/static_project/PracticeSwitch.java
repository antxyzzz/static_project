package static_project;

public class PracticeSwitch {

	public static void main(String[] args) {
		int[] jobNumbers = { 1, 2, 3, 4, 5, 2, 4, 1, 3, 5 };

		for (int jobNumber : jobNumbers) {
			String job = "";

			switch (jobNumber) {
			case 1:
				job = "勇者";
				break;
			case 2:
				job = "バトルマスター";
				break;
			case 3:
				job = "パラディン";
				break;
			case 4:
				job = "海賊";
				break;
			case 5:
				job = "魔法剣士";
				break;
			}
			System.out.println(jobNumber + ":" + job);
		}

	}

}
