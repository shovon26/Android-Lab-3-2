lectures(codd, cse9020).
lectures(codd,cse9314).
lectures(backus,cse9021).
lectures(rictchie,cse9201).
lectures(minsky,cse9414).
lectures(backus,cse9311).
course_offered_in_semester(summer,cse9020).
course_offered_in_semester(fall,cse9201).
course_offered_in_semester(summer,cse9021).
course_offered_in_semester(spring,cse9414).
course_offered_in_semester(spring,cse9311).
course_offered_in_semester(fall,cse9314).
studies_in(fred,cse9020).
studies_in(jack,cse9311).
studies_in(jill,cse9314).
studies_in(jill,cse9414).
studies_in(henry,cse9414).
studies_in(henry,cse9314).
course_list_of(X,Y):-lectures(X,Y).
taught_by(X,Y):- lectures(X,C),studies_in(Y,C).
freds_summer_courses(Y):-studies_in(fred,Y),course_offered_in_semester(summer,Y).
taught_in_summer(X):-lectures(X,Y),course_offered_in_semester(summer,Y).
studying(X,Y):-studies_in(X,Y)
