package main;

import model.Programmer;
import model.ProgrammerDAO;

public class Main {
	private final ProgrammerDAO programmerDAO = new ProgrammerDAO();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
		Main main = new Main();
		main.showProgrammersSpecify("SoeThu");
		main.showProgrammers();
		
//		Programmer programmer = new Programmer("Mg", "manager", 9) ;
//		main.insertProgrammer(programmer);
//		
//		Programmer programmer = new Programmer(4, "MgAung", "Programmer", 5.9);
//		main.updateProgrammer(programmer);
//		
//		main.deleteProgrammer(1);
		
//		main.showProgrammers();
	}

//	public void deleteProgrammer(int id) {
//		int rowEfected = programmerDAO.deleteProgrammer(id);
//		
//		System.out.println((rowEfected>0)? "Deleted id"+id:"Delete Fail!");
//	}
	public void updateProgrammer(Programmer programmer) {
		int rowEfected = programmerDAO.updateProgrammer(programmer);
		
		System.out.println((rowEfected>0)? "Updated"+ programmer.getName():"Update Fail!");
	}
	public void insertProgrammer(Programmer programmer) {
		int rowEffected = programmerDAO.createProgrammer(programmer);
		
		System.out.println((rowEffected > 0) ? "Created Programmer:"+programmer.getName():"Cant Create");
	}
	public void showProgrammers() {
		programmerDAO.readProgrammerList().forEach(System.out::println);
	}
	
	public void showProgrammersSpecify(String name) {
		programmerDAO.readProgrammerSpecify(name).forEach(System.out::println);
	}
}
