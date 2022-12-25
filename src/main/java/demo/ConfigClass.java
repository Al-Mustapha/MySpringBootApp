package demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
@ComponentScan(basePackages = "demo")
public class ConfigClass {
    @Bean
    public MyRepositoryClass repositoryClass(){
        return new MyRepositoryClass() {
            @Override
            public List<StudentClass> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<StudentClass> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends StudentClass> S save(S entity) {
                return null;
            }

            @Override
            public <S extends StudentClass> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<StudentClass> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public List<StudentClass> findAll() {
                return null;
            }

            @Override
            public List<StudentClass> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(StudentClass entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends StudentClass> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends StudentClass> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends StudentClass> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<StudentClass> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public StudentClass getOne(Long aLong) {
                return null;
            }

            @Override
            public StudentClass getById(Long aLong) {
                return null;
            }

            @Override
            public StudentClass getReferenceById(Long aLong) {
                return null;
            }

            @Override
            public <S extends StudentClass> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends StudentClass> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends StudentClass> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends StudentClass> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends StudentClass> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends StudentClass> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends StudentClass, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }
    @Bean
    public ServiceClass serviceClass(){
        return new ServiceClass() {
            @Override
            public StudentClass saveStudent(StudentClass studentClass) {
                return new StudentClass();
            }

            @Override
            public StudentClass getStudents(Long id) {
                return new StudentClass();
            }
        };

    }

}
