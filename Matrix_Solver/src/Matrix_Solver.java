import java.io.*;     // for File, FileNotFoundException
import java.util.*;   // for Scanner, List, Set, Collections

public class Matrix_Solver {

	private static final String LISTFILE = "posList";
	private static final int ENUM = 327; // num of column or line +1
	private static final int TOP = 10; 

	public static void main(String[] args) throws IOException {

		// open source file
		//		System.out.println("What is the name of the file containing all MI data? ");
		//		Scanner console1 = new Scanner(System.in);
		//		String fileName = console1.nextLine();

		//		System.out.println("What is the file containing list of the interested "
		//				+ "position? If all, enter \"All\"");
		//		Scanner console2 = new Scanner(System.in);
		//		String listFile = console2.nextLine();

		//		System.out.println("What is the name of the result file?");
		//		Scanner console3 = new Scanner(System.in);
		//		String outFile = console3.nextLine();

		System.out.println("What is the path of the data folder?");
		Scanner console4 = new Scanner(System.in);
		String pathS = console4.nextLine();
		File path = new File(pathS);
		File allFiles[] = path.listFiles();
		String dir = path.getPath();
		for (File file : allFiles) {
			String fName = file.getName();
			if(fName.endsWith(".data")) {

				// here comes the choice one ***************************************	
				//				List<Double> interest = new ArrayList<Double>();
				//
				//				interest.add(0.0);
				//				//				if (listFile.equals("All")) {
				//				//					for (int element = 1; element < ENUM; element++) {
				//				//						interest.add(element + 0.0);
				//				//					}
				//				//				} else {
				//				//					Scanner in = new Scanner(new File(listFile));
				//				//					while (in.hasNextLine()) {
				//				//						interest.add(Double.valueOf(in.nextLine().trim()).doubleValue());
				//				//					}
				//				//				}		
				//
				//				Scanner in = new Scanner(new File(dir, LISTFILE + ".txt"));
				//				while (in.hasNextLine()) {
				//					interest.add(Double.valueOf(in.nextLine().trim()).doubleValue());
				//				}
				//
				//				//				interest = sort(interest);
				//				//				
				//				Collections.sort(interest);
				//
				//				printList(interest);
				//
				//				double[][] matrix = new double[ENUM][ENUM];
				//				Scanner input = new Scanner(file);
				//				int line = 1;
				//				int col = 2;
				//				for (int i = 0; i < ENUM; i++) {
				//					matrix[0][i] = i;
				//					matrix[i][0] = i;
				//				}		
				//				matrix[1][1] = 0;
				//				while (input.hasNextLine()) {
				//					double num = Double.valueOf(input.nextLine().trim()).doubleValue();
				//					if (col > ENUM - 1) {
				//						line++;
				//						col = line + 1;
				//						for (int p = 1; p < line + 1; p++) {
				//							matrix[line][p] = 0;
				//						}
				//					}
				//					matrix[line][col] = num;
				//					col++;
				//				}
				//
				//				for(int x = 2; x < ENUM; x++) {
				//					for (int y = 1; y < x; y++) {
				//						matrix[x][y] = matrix[y][x];
				//					}
				//				}
				//
				//				int size = interest.size();
				//
				//				System.out.println(matrix);
				//				System.out.println(size);
				//
				//				File result = new File(dir, 
				//						"Matrix-" + fName.substring(0, fName.length() - 5) + ".txt");
				//				result.createNewFile(); 
				//				PrintStream output = new PrintStream(result);
				//				output.print(0);
				//				for (int r = 1; r < size; r++) {
				//					double p = interest.get(r);
				//					int pi = (int) p;
				//					output.print("	" + pi);
				//				}
				//				output.println();
				//				for (int l = 1; l < size ; l++) {
				//					double cur = interest.get(l);
				//					int curcol = (int) cur;
				//					output.print(curcol);
				//					for (int u = 1; u < l; u++) {
				//						double t = interest.get(u);
				//						int ti = (int) t;
				//						output.print("	" + matrix[ti][curcol]);
				//					}
				//					output.print("	" + 0);
				//					for (int k = l + 1; k < size; k++) {
				//						double o = interest.get(k);
				//						int oi = (int) o;
				//						output.print("	" + matrix[curcol][oi]);
				//					}
				//					output.println();
				//				}
				//
				//				//		for (int j = 0; j < ENUM; j++) {
				//				//			for (int k = 0; k < ENUM; k++) {
				//				//				output.print(matrix[j][k]);
				//				//				output.print("	");
				//				//			}
				//				//			output.println();
				//				//		}		

				//here comes the choice two**********************
				//
				//				File result = new File(dir, "Sorted-" + fName.substring(0, fName.length() - 5) + ".txt");
				//				result.createNewFile(); 
				//				PrintStream output = new PrintStream(result);
				//
				//				Scanner input = new Scanner(file);
				//				while (input.hasNext()) {
				//					String[] words = input.nextLine().split("[ \t]+"); 
				//					for (int i = 0; i < words.length; i++) {
				//						output.print("	" + words[i]);
				//					}
				//					output.println();
				//				}			
				//
				//				//here comes the choice three**********************
				//
				//				File result = new File(dir, "Sorted-" + fName.substring(0, fName.length() - 5) + ".txt");
				//				result.createNewFile(); 
				//				PrintStream output = new PrintStream(result);
				//
				//				Scanner input = new Scanner(file);
				//				while (input.hasNext()) {
				//					if (input.nextLine().equals(">")) {
				//						
				//					}
				//					String[] words = input.nextLine().split("[ \t]+"); 
				//					for (int i = 0; i < words.length; i++) {
				//						output.print("	" + words[i]);
				//					}
				//					output.println();
				//				}			

				//				// here comes the choice four ***************************************	
				//				List<Integer> interest = new ArrayList<Integer>();
				//
				//				Scanner in = new Scanner(new File(dir, LISTFILE + ".txt"));
				//				while (in.hasNextLine()) {
				//					double d = Double.valueOf(in.nextLine().trim()).doubleValue();
				//					int di = (int) d;
				//					interest.add(di);
				//				}
				//
				//				double[][] matrix = new double[ENUM][ENUM];
				//				int line = 1;
				//				int col = 2;
				//				for (int i = 0; i < ENUM; i++) {
				//					matrix[0][i] = i;
				//					matrix[i][0] = i;
				//				}		
				//				matrix[1][1] = 0;
				//
				//				Scanner input = new Scanner(file);
				//				List<Double> allData = new ArrayList<Double>();
				//				while (input.hasNextLine()) {
				//					double num = Double.valueOf(input.nextLine().trim()).doubleValue();
				//					allData.add(num);
				//					if (col > ENUM - 1) {
				//						line++;
				//						col = line + 1;
				//						for (int p = 1; p < line + 1; p++) {
				//							matrix[line][p] = 0;
				//						}
				//					}
				//					matrix[line][col] = num;
				//					col++;
				//				}
				//
				//				for(int x = 2; x < ENUM; x++) {
				//					for (int y = 1; y < x; y++) {
				//						matrix[x][y] = matrix[y][x];
				//					}
				//				}
				//
				//				File result = new File(dir, 
				//						"Rank-" + fName.substring(0, fName.length() - 5) + ".txt");
				//				result.createNewFile(); 
				//				PrintStream output = new PrintStream(result);
				//
				//				for(int j = 0; j < interest.size(); j++) {
				//					double[][] matrix2 = new double[ENUM][ENUM];
				//					for(int y = 0; y < ENUM; y++) {
				//						for(int z = 0; z < ENUM; z++) {
				//							matrix2[y][z] = matrix[y][z];
				//						}
				//					}
				//
				//					int cur = interest.get(j);
				//					output.print(cur + "	");
				//					for(int p = 2; p < ENUM; p++){  
				//						int o = p - 1;  
				//						Double td1 = matrix[0][p];
				//						Double td2 = matrix[cur][p];  
				//						for(; o >= 0 && td2 < matrix[cur][o]; o--) {  
				//							matrix[cur][o + 1]=matrix[cur][o];  
				//							matrix[0][o + 1]=matrix[0][o];  
				//						}  
				//						matrix[0][o + 1] = td1;
				//						matrix[cur][o + 1] = td2;  
				//					}
				//					int topRank = TOP;
				//					for (int coun = 0; coun < topRank; coun++) {
				//						double res = matrix[0][ENUM - 1 - coun];
				//						int resi = (int) res;
				//						if(resi == 0) {
				//							topRank++;
				//						} else {
				//							output.print(resi + " ");							
				//						}
				//					}
				//					output.println();
				//
				//					for(int y = 0; y < ENUM; y++) {
				//						for(int z = 0; z < ENUM; z++) {
				//							matrix[y][z] = matrix2[y][z];
				//						}
				//					}
				//				}

				//				// here comes choice five
				//				List<Double> interest = new ArrayList<Double>();
				//
				//				interest.add(0.0);
				//
				//				Scanner in = new Scanner(new File(dir, "posList-" 
				//						+ fName.substring(0, fName.length() - 5) + ".txt"));
				//				while (in.hasNextLine()) {
				//					interest.add(Double.valueOf(in.nextLine().trim()).doubleValue());
				//				}
				//
				//				double[][] matrix = new double[ENUM][ENUM];
				//				Scanner input = new Scanner(file);
				//				int line = 1;
				//				int col = 2;
				//				for (int i = 0; i < ENUM; i++) {
				//					matrix[0][i] = i;
				//					matrix[i][0] = i;
				//				}		
				//				matrix[1][1] = 0;
				//				while (input.hasNextLine()) {
				//					double num = Double.valueOf(input.nextLine().trim()).doubleValue();
				//					if (col > ENUM - 1) {
				//						line++;
				//						col = line + 1;
				//						for (int p = 1; p < line + 1; p++) {
				//							matrix[line][p] = 0;
				//						}
				//					}
				//					matrix[line][col] = num;
				//					col++;
				//				}
				//
				//				for(int x = 2; x < ENUM; x++) {
				//					for (int y = 1; y < x; y++) {
				//						matrix[x][y] = matrix[y][x];
				//					}
				//				}
				//
				//				int size = interest.size();
				//
				//				System.out.println(matrix);
				//				System.out.println(size);
				//
				//				File result = new File(dir, 
				//						"Matrix-" + fName.substring(0, fName.length() - 5) + ".txt");
				//				result.createNewFile(); 
				//				PrintStream output = new PrintStream(result);
				//				output.print(0);
				//				for (int r = 1; r < size; r++) {
				//					double p = interest.get(r);
				//					int pi = (int) p;
				//					output.print("	" + pi);
				//				}
				//				output.println();
				//				for (int l = 1; l < size ; l++) {
				//					double cur = interest.get(l);
				//					int curcol = (int) cur;
				//					output.print(curcol);
				//					for (int u = 1; u < l; u++) {
				//						double t = interest.get(u);
				//						int ti = (int) t;
				//						output.print("	" + matrix[ti][curcol]);
				//					}
				//					output.print("	" + 0);
				//					for (int k = l + 1; k < size; k++) {
				//						double o = interest.get(k);
				//						int oi = (int) o;
				//						output.print("	" + matrix[curcol][oi]);
				//					}
				//					output.println();
				//				}

				// here comes choice six
				List<Integer> interest = new ArrayList<Integer>();
				List<String> dataSet = new ArrayList<String>();

				Scanner in = new Scanner(new File(dir, LISTFILE + ".txt"));
				while (in.hasNextLine()) {
					interest.add(Integer.valueOf(in.nextLine().trim()).intValue());
				}

				Scanner input = new Scanner(file);
				while (input.hasNextLine()) {
					dataSet.add(input.nextLine());
				}

				int size = interest.size();

				System.out.println(size);

				File result = new File(dir, 
						"Selected-" + fName.substring(0, fName.length() - 5) + ".txt");
				result.createNewFile(); 
				PrintStream output = new PrintStream(result);
				for (int r = 0; r < size; r++) {
					int p = interest.get(r);
					String CurLine = dataSet.get(p-1);
					output.print(CurLine);
					output.println();
				}

			}
		}
	}

	private static void printList(List<Double> interest) {
		for (int u = 0; u < interest.size(); u++) {
			System.out.println(interest.get(u));
		}
	}

	//	private static List<Double> sort(List<Double> interest) {
	//		List<Double> temp = new ArrayList<Double>();
	//		
	//		return temp;
	//	}
}

