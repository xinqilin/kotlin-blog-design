package com.bill.blog.repository

import com.bill.blog.entity.AdminUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author Bill.Lin on 2021/8/5
 */
@Repository
interface AdminUserRepository : JpaRepository<AdminUser, Long> {
}