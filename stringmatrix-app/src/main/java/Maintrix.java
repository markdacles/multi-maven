public class Maintrix {

	public static void main(String[] args) {

		int action = 0;
		boolean redo = true;
		Matrixer matrix = new Matrixer();

		while (redo) {
			System.out.print("\n1. Print\n2. Edit\n3. Search\n4. Add Row \n5. Sort\n6. Reset\n7. Exit\nSelect action: ");
			action = IOUtil.scanInt("action");
			switch (action) {
				case 1:
					matrix.displayTable();
					break;
				case 2:
					matrix.editTable();
					matrix.displayTable();
					matrix.writeToFile();
					break;
				case 3:
					matrix.searchTable();
					break;
				case 4:
					matrix.addRow();
					matrix.displayTable();
					matrix.writeToFile();
					break;
				case 5:
					matrix.sortTable();
					matrix.displayTable();
					matrix.writeToFile();
					break;
				case 6:
					matrix.resetTable();
					matrix.displayTable();
					matrix.writeToFile();
					break;
				case 7:
					System.exit(0);
				default:
					System.out.println("Error! Invalid input. Please try again.");
			}
		}

	}

}