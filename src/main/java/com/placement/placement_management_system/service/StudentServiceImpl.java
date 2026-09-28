package com.placement.placement_management_system.service;

import com.placement.placement_management_system.entity.Student;
import com.placement.placement_management_system.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    @Override
    public Student updateStudent(Long id, Student student) {

        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));

        existingStudent.setName(student.getName());
        existingStudent.setHallTicketNumber(student.getHallTicketNumber());
        existingStudent.setQualification(student.getQualification());
        existingStudent.setCourse(student.getCourse());
        existingStudent.setYearOfPassing(student.getYearOfPassing());
        existingStudent.setCertificate(student.getCertificate());

        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(Long id) {

        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found with ID: " + id);
        }

        studentRepository.deleteById(id);
    }
}