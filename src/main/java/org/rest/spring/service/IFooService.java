package org.rest.spring.service;

import java.util.List;

import org.rest.spring.model.Foo;

public interface IFooService {

	public List<Foo> findAll();

	public Foo findOne(Long id);

	public Long create(Foo resource);

	public void update(Long id, Foo resource);

	public void delete(Long id);
}
