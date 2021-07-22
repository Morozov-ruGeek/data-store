CREATE TABLE `document` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  `series` bigint DEFAULT NULL,
  `number` bigint DEFAULT NULL,
  `document_date` timestamp(6) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_type_idx` (`type_id`),
  KEY `fk_user_idx` (`user_id`) /*!80000 INVISIBLE */,
  CONSTRAINT `fk_type_id` FOREIGN KEY (`type_id`) REFERENCES `document_type` (`id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_ai_ci;

CREATE TABLE `document_type` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `document_name` varchar(45) COLLATE utf8mb4_vi_0900_ai_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_type_idx` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_ai_ci;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) COLLATE utf8mb4_vi_0900_ai_ci NOT NULL,
  `last_name` varchar(45) COLLATE utf8mb4_vi_0900_ai_ci NOT NULL,
  `patronymic` varchar(45) COLLATE utf8mb4_vi_0900_ai_ci DEFAULT NULL,
  `birthday` timestamp(6) NOT NULL,
  `sex` varchar(1) COLLATE utf8mb4_vi_0900_ai_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vi_0900_ai_ci;
