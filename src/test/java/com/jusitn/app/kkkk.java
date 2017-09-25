package com.jusitn.app;

import org.junit.Test;

public class kkkk {

    @Test
    public void ff()
    {
        String stre= "sdfsdfsdf sdf sdf sdf sdf <script> sdf sdf  </script> sdf sdf ";
       String u = stre.replaceAll("(<script>)(.)*(</script>)","");
        System.out.println(u);
    }
}

