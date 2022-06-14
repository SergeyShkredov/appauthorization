package com.example.appauthorization.jpa

import org.hibernate.Hibernate
import javax.persistence.*

@Entity
@Table(name = "roles")
data class Role (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = null,

        @Column(name="name")
        var name: String? = null

) {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
                other as Role

                return id != null && id == other.id
        }

        override fun hashCode(): Int = javaClass.hashCode()

        @Override
        override fun toString(): String {
                return this::class.simpleName + "(id = $id , name = $name )"
        }
}

