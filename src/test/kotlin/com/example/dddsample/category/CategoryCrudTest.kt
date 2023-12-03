package com.example.dddsample.category

import com.example.dddsample.category.domain.Category
import com.example.dddsample.category.infra.CategoryMysqlRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class CategoryCrudTest {

    @Autowired
    private lateinit var categoryMysqlRepository: CategoryMysqlRepository

    @Test
    @Rollback(value = false)
    fun `save - 카테고리 생성 성공`() {
        val category = Category(name = "자전거")
        val save = categoryMysqlRepository.save(category)
        assertEquals(category.name, save.name)
    }

    @Test
    @Rollback(value = false)
    fun `update - 카테고리 수정 성공`() {
        val category = Category(name = "자전거")
        val save = categoryMysqlRepository.save(category)
        save.updateName("자동차")
        assertEquals("자동차", save.name)
    }

    @Test
    @Rollback(value = false)
    fun `search - 카테고리 조회 성공`() {
        val categories = categoryMysqlRepository.findAll()
        assertTrue(categories.size > 0)
    }
}
