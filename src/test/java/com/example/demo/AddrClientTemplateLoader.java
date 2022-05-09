package com.example.demo;

import java.io.IOException;
import java.nio.charset.Charset;

import com.github.jknack.handlebars.io.TemplateLoader;
import com.github.jknack.handlebars.io.TemplateSource;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class AddrClientTemplateLoader implements TemplateLoader {
    
    @Override
    public void load() {
        Fixture.of(Address.class).addTemplate("valid", new Rule() {{
            add("bairro", "Liberdade");
            add("cidade", "BH");
            add("logradouro", "Rua dos bobos");
            add("estado", "MG");

        }});
    }

    @Override
    public Charset getCharset() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPrefix() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getSuffix() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String resolve(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setCharset(Charset arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setPrefix(String arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setSuffix(String arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public TemplateSource sourceAt(String arg0) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }
}
