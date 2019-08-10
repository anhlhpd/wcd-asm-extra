package com.t1708e;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Calendar;

@Entity
public class Phone {
    @Id
    private long id;
    private String name;
    private String brand;
    private String price;
    private String description;

    private long createdAtMLS;
    private long updatedAtMLS;
    private long deletedAtMLS;
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreatedAtMLS() {
        return createdAtMLS;
    }

    public void setCreatedAtMLS(long createdAtMLS) {
        this.createdAtMLS = createdAtMLS;
    }

    public long getUpdatedAtMLS() {
        return updatedAtMLS;
    }

    public void setUpdatedAtMLS(long updatedAtMLS) {
        this.updatedAtMLS = updatedAtMLS;
    }

    public long getDeletedAtMLS() {
        return deletedAtMLS;
    }

    public void setDeletedAtMLS(long deletedAtMLS) {
        this.deletedAtMLS = deletedAtMLS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static final class Builder {
        private long id;
        private String name;
        private String brand;
        private String price;
        private String description;
        private long createdAtMLS;
        private long updatedAtMLS;
        private long deletedAtMLS;
        private int status;

        private Builder() {
            this.id = Calendar.getInstance().getTimeInMillis();
            this.createdAtMLS = Calendar.getInstance().getTimeInMillis();
            this.updatedAtMLS = Calendar.getInstance().getTimeInMillis();
            this.deletedAtMLS = Calendar.getInstance().getTimeInMillis();
            this.status = 1;
        }

        public static Builder aPhone() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withCreatedAtMLS(long createdAtMLS) {
            this.createdAtMLS = createdAtMLS;
            return this;
        }

        public Builder withUpdatedAtMLS(long updatedAtMLS) {
            this.updatedAtMLS = updatedAtMLS;
            return this;
        }

        public Builder withDeletedAtMLS(long deletedAtMLS) {
            this.deletedAtMLS = deletedAtMLS;
            return this;
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.setId(id);
            phone.setName(name);
            phone.setBrand(brand);
            phone.setPrice(price);
            phone.setDescription(description);
            phone.setCreatedAtMLS(createdAtMLS);
            phone.setUpdatedAtMLS(updatedAtMLS);
            phone.setDeletedAtMLS(deletedAtMLS);
            phone.setStatus(status);
            return phone;
        }
    }
}
