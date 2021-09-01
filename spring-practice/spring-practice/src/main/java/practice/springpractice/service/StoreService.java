package practice.springpractice.service;

import org.springframework.transaction.annotation.Transactional;
import practice.springpractice.domain.Store;
import practice.springpractice.repository.StoreRepository;

import java.util.List;
import java.util.Optional;

@Transactional
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public void tableSave(Store store, int value) {
        storeRepository.tableSave(store, value);
    }

    public List<Store> findByStoreName(String name, String area) {
        return storeRepository.findByStoreName(name, area);
    }

    public Store findByStoreValue(String name) {
        return storeRepository.findByStoreValue(name);
    }

    public List<Store> findAllStore() {
        return storeRepository.findAllStore();
    }

    public Optional<Store> BooleanStore(String id) {return storeRepository.BooleanStore(id); }
}
