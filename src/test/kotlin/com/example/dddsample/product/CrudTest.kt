//package com.example.dddsample.product
//
//import com.example.dddsample.category.domain.Category
//import com.example.dddsample.category.infra.CategoryRepository
//import com.example.dddsample.product.domain.Product
//import com.example.dddsample.product.domain.ProductFile
//import com.example.dddsample.product.domain.ProductFileType
//import com.example.dddsample.product.domain.ProductStatus
//import com.example.dddsample.product.infra.ProductRepository
//import org.junit.jupiter.api.Test
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.data.repository.findByIdOrNull
//import org.springframework.test.annotation.Rollback
//import org.springframework.transaction.annotation.Transactional
//
//
//@SpringBootTest
//@Transactional
//class CrudTest {
//
//    @Autowired
//    private lateinit var productRepository: ProductRepository
//
//    @Autowired
//    private lateinit var categoryRepository: CategoryRepository
//
//    @Test
//    @Rollback(value = false)
//    fun `save - 카테고리 생성 성공`() {
//        categoryRepository.save(Category(name = "hi"))
//    }
//
//    @Test
//    @Rollback(value = false)
//    fun `save - 상품 생성 성공`() {
//        val product = productRepository.save(
//            Product(
//                name = "ih",
//                description = "ppl",
//                price = 5000,
//                stock = 40,
//                status = ProductStatus.CLOSE,
//                categoryIds = mutableListOf(4, 5),
//                productFiles = mutableListOf()
//            )
//        )
//
//        println(product.id)
//        println(product.name)
//        println(product.categoryIds)
//    }
//
//    @Test
//    @Rollback(value = false)
//    fun `search - 상품 조회 성공`() {
//        val product = productRepository.findByIdOrNull(1)!!
//        println(product.price)
//        //lazy
//        println(product.categoryIds)
//    }
//
//    @Test
//    @Rollback(value = false)
//    fun `update - 상품 name, category 성공`() {
//        val product = productRepository.findByIdOrNull(7)!!
//        product.updateName("ih~")
//        product.updateCategoryIds(mutableListOf(4,5,6))
//        productRepository.save(product)
//    }
//
//    @Test
//    @Rollback(value = false)
//    fun `save - 상품 등록`() {
//        categoryRepository.save(Category(name = "hi"))
//        val product = productRepository.save(
//            Product(
//                name = "ih",
//                description = "ppl",
//                price = 5000,
//                stock = 40,
//                status = ProductStatus.CLOSE,
//                categoryIds = mutableListOf(4, 5),
//                productFiles = mutableListOf()
//            )
//        )
//
//        product.addFile(
//            file = ProductFile(
//                url = "a",
//                displayName = "a",
//                name = "c",
//                size = 100,
//                type = ProductFileType.IMAGE
//            )
//        )
//
//        productRepository.save(product)
//    }
//
//    @Test
//    @Rollback(value = false)
//    fun `save - image 추가`() {
//        val product = productRepository.findByIdOrNull(1)!!
//        product.addFile(
//            file = ProductFile(
//                url = "a",
//                displayName = "a",
//                name = "c",
//                size = 100,
//                type = ProductFileType.IMAGE
//            )
//        )
//
//        productRepository.save(product)
//    }
//
//    @Test
//    @Rollback(value = false)
//    fun `update - image 제거`() {
//        val product = productRepository.findByIdOrNull(1)!!
//        product.removeFile(1)
//        productRepository.save(product)
//    }
//
//}