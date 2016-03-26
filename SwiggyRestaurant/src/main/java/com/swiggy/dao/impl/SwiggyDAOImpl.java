package com.swiggy.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.swiggy.dao.ISwiggyDAO;

@Service
@Component
@Configuration
public class SwiggyDAOImpl implements ISwiggyDAO {

	Logger logger = LoggerFactory.getLogger(SwiggyDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int getSwiggymenu(Integer id) {
		int result = 0;

		String query = "select id_main_category ,maincat.name as mainname,maincat.desc as maindesc,id_menu_subcategory,main_category_id,subcat.name as subname,subcat.desc as subdesc,idswiggy_item_details,sub_category_id,idet.name,itemDesc from swiggy_main_category as maincat join swiggy_menu_subcategory as subcat on  maincat.id_main_category = subcat.id_menu_subcategory  join swiggy_item_details as idet on idet.sub_category_id = idet.sub_category_id where idet.idswiggy_item_details=  ?";
		
		logger.info("In DAO Layer");
		
		try {
			TemplateMapping templateMapping = jdbcTemplate.queryForObject(query, new Object[] { id },
					new RowMapper<TemplateMapping>() {
						public TemplateMapping mapRow(ResultSet rs, int rowNum) throws SQLException {
							TemplateMapping templateMapping = new TemplateMapping();

							return templateMapping;
						}

					});
			logger.info("Hi Done");

		} catch (Exception ex) {
			// throw new ComputeException(ex.getMessage());

			logger.info("Exception" + ex.getMessage());

		}
		return result;
	}
}
