package com.raistudies.paging;

import java.util.List;
import java.util.Map;

import org.springframework.core.annotation.Order;

/**
 * @describe
 * @author Root
 * @version 1.0
 */
public interface AbstractDao<E> {

	/**
	 * 插入数据
	 * 
	 * @param e
	 *            实体类
	 * @return 主键值
	 */
	public long insert(E e);

	/**
	 * 批量插入数据
	 * 
	 * @param data
	 *            实体类
	 * @return 主键值
	 */
	public void batchInsert(List<E> data);

	/**
	 * 替换数据
	 * 
	 * @param e
	 *            实体类
	 * @return 主键值
	 */
	public long replace(E e);

	/**
	 * 批量替换数据
	 * 
	 * @param data
	 *            实体类
	 * @return 主键值
	 */
	public void batchReplace(List<E> data);

	/**
	 * 更新数据
	 * 
	 * @param e
	 *            新数据
	 * @param conditions
	 *            更新条件
	 */
	public int update(E e, Map<String, Object> conditions);

	/**
	 * 根据主键更新数据
	 * 
	 * @param e
	 *            新数据
	 * @param primary
	 *            主键值
	 */
	public void updateByPrimary(E e, long primary);

	/**
	 * 获取一条记录
	 * 
	 * @param conditions
	 *            查询条件
	 * @param offset
	 *            偏移量
	 * @param orders
	 *            排序
	 * @return 查询结果
	 */
	public E getOne(Map<String, Object> conditions, int offset,
			Map<String, Order> orders);

	/**
	 * 获取一条记录
	 * 
	 * @param conditions
	 *            查询条件
	 * @param offset
	 *            偏移量
	 * @return 查询结果
	 */
	public E getOne(Map<String, Object> conditions, int offset);

	/**
	 * 获取一条记录
	 * 
	 * @param conditions
	 *            查询条件
	 * @param orders
	 *            排序
	 * @return 查询结果
	 */
	public E getOne(Map<String, Object> conditions, Map<String, Order> orders);

	/**
	 * 获取一条记录
	 * 
	 * @param conditions
	 *            查询条件
	 * @return 查询结果
	 */
	public E getOne(Map<String, Object> conditions);

	/**
	 * 数据查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @param offset
	 *            偏移量
	 * @param size
	 *            查询条数
	 * @param orders
	 *            排序
	 * @return 结果集
	 */
	public List<E> select(Map<String, Object> conditions, int offset, int size,
			Map<String, Order> orders);

	/**
	 * 数据查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @param offset
	 *            偏移量
	 * @param size
	 *            查询条数
	 * @return 结果集
	 */
	public List<E> select(Map<String, Object> conditions, int offset, int size);

	/**
	 * 数据查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @param size
	 *            查询条数
	 * @param orders
	 *            排序
	 * @return 结果集
	 */
	public List<E> select(Map<String, Object> conditions, int size,
			Map<String, Order> orders);

	/**
	 * 数据查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @param size
	 *            查询条数
	 * @return 结果集
	 */
	public List<E> select(Map<String, Object> conditions, int size);

	/**
	 * 数据查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @param orders
	 *            排序
	 * @return 结果集
	 */
	public List<E> select(Map<String, Object> conditions,
			Map<String, Order> orders);

	/**
	 * 数据查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @return 结果集
	 */
	public List<E> select(Map<String, Object> conditions);

	/**
	 * 数据分页查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @param page
	 *            页码
	 * @param pagesize
	 *            每页大小
	 * @param orders
	 *            排序
	 * @return Pagination
	 */
	public Pagination<E> page(Map<String, Object> conditions, int page,
			int pagesize, Map<String, Order> orders);

	/**
	 * 数据分页查询
	 * 
	 * @param conditions
	 *            查询条件
	 * @param page
	 *            页码
	 * @param pagesize
	 *            每页大小
	 * @return Pagination
	 */
	public Pagination<E> page(Map<String, Object> conditions, int page,
			int pagesize);

	/**
	 * 根据主键查询数据
	 * 
	 * @param primary
	 *            主键值
	 * @return 数据结果
	 */
	public E getByPrimary(long primary);

	/**
	 * 查询所有数据
	 * 
	 * @return 结果集
	 */
	public List<E> getAll();

	/**
	 * 数据记录总数
	 * 
	 * @param conditions
	 *            查询条件
	 * @return 记录总数
	 */
	public int count(Map<String, Object> conditions);

	/**
	 * 删除数据
	 * 
	 * @param conditions
	 *            删除条件
	 * @return 影响条数
	 */
	public int delete(Map<String, Object> conditions);

	/**
	 * 根据主键删除数据
	 * 
	 * @param primary
	 *            主键值
	 * @return 影响条数
	 */
	public int deleteByPrimary(long primary);

	/**
	 * 清空数据
	 * 
	 * @return 影响条数
	 */
	public int clear();

}
