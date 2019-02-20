package com.lzx.select.mappers;

import com.lzx.select.entity.CustomerEntity;
import com.lzx.select.entity.InvoiceEntity;

import java.util.List;


public interface SelectMapper {
    InvoiceEntity getInvoiceByInvoiceId(int id);

    InvoiceEntity getInvoiceForCustomerByInvoiceId(int id);

    CustomerEntity getCustomerById(int id);




    CustomerEntity getCusById(int id);

    List<InvoiceEntity> getIncByCustomerId(int id);

    List<CustomerEntity> getAll();
}
