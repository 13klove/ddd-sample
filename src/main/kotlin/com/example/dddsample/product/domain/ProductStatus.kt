package com.example.dddsample.product.domain

enum class ProductStatus {

    WAIT, 	        // 판매대기
    ON_SALE,	    // 판매중
    CLOSE,	        // 판매종료
    OUT_OF_STOCK,	// 품절
    SUSPENSION,	    // 판매중지
    PROHIBITION,	// 판매금지
    DELETED         // 삭제

}