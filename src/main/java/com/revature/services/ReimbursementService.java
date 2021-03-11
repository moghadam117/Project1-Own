package com.revature.services;

import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.repositories.ReimbDAO;
import com.revature.repositories.ReimbDAOImpl;

public class ReimbursementService {
public static ReimbDAO rDao = new ReimbDAOImpl();
	
	
public void submitReimbEmp (Reimbursement reimbursement) {
	ReimbursementService.rDao.submitReimbEmp(reimbursement);
	}

public static List<Reimbursement> findAll() {
	return rDao.findAll();
}

public static List<Reimbursement> findByUserID(int id)  {
	List<Reimbursement> all = rDao.findAll();
	//List<Employee> all = findAll(); // another way to do it
	
	for (Reimbursement r : all) { // filtering with an enhanced for-loop!
		if (r.getAuthorId() == id ){
			return all; // we return the Employee object with a matching ID
		}
	}
	
	return null;
}

public static List<Reimbursement> findByStatus(int statusId) {
	return rDao.findByStatus(statusId);
}

public static void resolveReimbMan (Reimbursement reimbursement) {
	rDao.resolveReimbMan(reimbursement);
}
}
