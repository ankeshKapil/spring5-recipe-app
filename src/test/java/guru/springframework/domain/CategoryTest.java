package guru.springframework.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
Category category;
    @Before
    public void setUp() throws Exception {
        category=new Category();
    }
    @Test
    public void getId() throws Exception {
        category.setId(4l);
        Assert.assertEquals(new Long(4l),category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }




}