package com.example.springaop.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private int id;

    @NotBlank
    private String brandName;

    @NotBlank
    private String modelName;

    @Min(value = 1250)
    private int price;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date modelYear;
}
