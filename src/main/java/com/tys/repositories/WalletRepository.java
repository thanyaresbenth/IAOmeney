package com.tys.repositories;

import com.tys.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
}
