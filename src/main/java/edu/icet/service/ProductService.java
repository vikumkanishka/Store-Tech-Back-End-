package edu.icet.service;

import edu.icet.dto.ItemDto;

import java.util.List;

public interface ProductService {

    void addItem(ItemDto itemDto);

    void updateCustomer(ItemDto itemDto);

    void deleteItem(String id);

    List<ItemDto> getAllItems();
}
