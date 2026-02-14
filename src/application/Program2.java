package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println();
		System.out.println("=== TEST 2: findAll =======");
		List<Department> dep2 = departmentDao.findAll();
		dep2.forEach(System.out::println);

		System.out.println();
		System.out.println("=== TEST 3: Insert =======");
		Department newDepartment = new Department(null, "Cabelo");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id =  " + newDepartment.getId());

		/*
		 * System.out.println("=== TEST 4: UPDATE ======="); Department Department = new
		 * Department(2, "RH"); departmentDao.update(Department);
		 */

		System.out.println();
		System.out.println("=== TEST 5: department update  =====");
		Department Department = departmentDao.findById(2);
		Department.setName("Tecnologia");
		departmentDao.update(Department);
		System.out.println("Updated Complete");

		System.out.println();
		System.out.println("=== TEST 5: department Delete  =====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();

		while (id != 0) {
			departmentDao.deleteById(id);
			System.out.println("Delete Completed");
			id = sc.nextInt();
		}

	}
}
