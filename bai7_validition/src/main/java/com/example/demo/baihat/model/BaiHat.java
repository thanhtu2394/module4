package com.example.demo.baihat.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BaiHat {
    private Integer id;

    @NotBlank(message = "Không được phép để trống")
    @Size(min = 0, max = 800, message = "Không vượt qua 800 ký tự")
    @Pattern(regexp = "^[^\\;\\,\\.\\=\\-\\+]+$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String name;

    @NotBlank(message = "Không được phép để trống")
    @Size(min = 0, max = 300, message = "Không quá 300 ký tự")
    @Pattern(regexp = "^[^\\;\\,\\.\\=\\-\\+]+$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String casy;

    @NotBlank(message = "Không được phép để trống")
    @Size(min = 0, max = 1000, message = "hông vượt quá 1000 ký tự")
    @Pattern(regexp = "^[^\\;\\.\\=\\-\\+]+$", message = "Ngoại trừ dấu phẩy “,” , các ký tự đặc biệt còn lại không được phép lưu vào DB.ệ")
    private String theloai;

    public BaiHat(Integer id, @NotBlank(message = "Không được phép để trống") @Size(min = 0, max = 800, message = "Không vượt qua 800 ký tự") @Pattern(regexp = "^[^\\;\\,\\.\\=\\-\\+]+$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….") String name, @NotBlank(message = "Không được phép để trống") @Size(min = 0, max = 300, message = "Không quá 300 ký tự") @Pattern(regexp = "^[^\\;\\,\\.\\=\\-\\+]+$", message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….") String casy, @NotBlank(message = "Không được phép để trống") @Size(min = 0, max = 1000, message = "hông vượt quá 1000 ký tự") @Pattern(regexp = "^[^\\;\\.\\=\\-\\+]+$", message = "Ngoại trừ dấu phẩy “,” , các ký tự đặc biệt còn lại không được phép lưu vào DB.ệ") String theloai) {
        this.id = id;
        this.name = name;
        this.casy = casy;
        this.theloai = theloai;
    }

    public BaiHat() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCasy() {
        return casy;
    }

    public void setCasy(String casy) {
        this.casy = casy;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
}
