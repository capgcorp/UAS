DESC Programs_offered;
DESC Programs_Scheduled;
DESC Application;

SELECT * FROM Programs_offered;
SELECT * FROM Programs_Scheduled;





SELECT * FROM Programs_Scheduled;

INSERT INTO Application (Application_id,full_name,date_of_birth,highest_qualification,marks_obtained,
		goals,email_id,Scheduled_program_id,status,Date_Of_Interview,address)
		VALUES(1,'darwin','21-MAR-1996','B.tech',87,'developer','darwin@gmail.com','101','applied','23-OCT-2017',);

SELECT Status FROM Programs_Scheduled WHERE application_id=;



INSERT INTO Programs_offered (ProgramName,description,applicant_eligibility,duration,degree_certificate_offered) VALUES('java','language','B.Tech',60,'OCJP');
UPDATE Programs_offered SET ProgramName='orcl',description='dbms',applicant_eligibility='b tech',duration='60',degree_certificate_offered='oracle' WHERE ProgramName='java';
DELETE FROM Programs_offered WHERE ProgramName='java';




INSERT INTO Programs_Scheduled (Scheduled_program_id,ProgramName,City,Pincode,start_date,end_date,sessions_per_week) VALUES(100,'orcl','bnglr',560066,'20-oct-17','30-oct-17',4); 
UPDATE Programs_Scheduled SET Scheduled_program_id='101',ProgramName='orcl',City='hyd',Pincode='522006',start_date='20-oct-17',end_date='30-oct-17',sessions_per_week=5 WHERE Scheduled_program_id=100;
DELETE FROM Programs_Scheduled WHERE Scheduled_program_id=100;



//------------------------Applicant-------------------------------------//
SELECT * FROM Programs_Scheduled;






//--------------------admin -----------------------------//

UPDATE Programs_offered SET ProgramName=?,description=?,applicant_eligibility=?,duration=?,degree_certificate_offered=? WHERE ProgramName=?;
INSERT INTO Programs_offered (ProgramName,description,applicant_eligibility,duration,degree_certificate_offered) VALUES(?,?,?,?,?);
DELETE FROM Programs_offered WHERE ProgramName=?;

UPDATE Programs_Scheduled SET Scheduled_program_id=?,ProgramName=?,City=?,Pincode=?,start_date=?,end_date=?,sessions_per_week=? WHERE Scheduled_program_id=?;
INSERT INTO Programs_Scheduled (Scheduled_program_id,ProgramName,City,Pincode,start_date,end_date,sessions_per_week) VALUES(?,?,?,?,?,?,?);
DELETE FROM Programs_Scheduled WHERE Scheduled_program_id=?;