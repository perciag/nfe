package com.fincatto.documentofiscal.cte300.classes.evento.cancelamento;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.cte300.classes.evento.CTeEventoRetorno;
import com.fincatto.documentofiscal.validadores.BigDecimalParser;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.math.BigDecimal;

@Root(name = "procEventoCTe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeProtocoloEventoCancelamento extends DFBase {

    @Attribute(name = "versao", required = true)
    private String versao;

    @Element(name = "eventoCTe", required = true)
    private CTeEventoCancelamento evento;

    @Element(name = "retEventoCTe", required = false)
    private CTeEventoRetorno eventoRetorno;



    public String getVersao() {
        return this.versao;
    }

    public void setVersao(final BigDecimal versao) {
        this.versao = BigDecimalParser.tamanho4Com2CasasDecimais(versao, "Versao");
    }

    public CTeEventoCancelamento getEvento() {
        return evento;
    }

    public void setEvento(CTeEventoCancelamento evento) {
        this.evento = evento;
    }

    public void setEventoRetorno(final CTeEventoRetorno infoEventoRetorno) {
        this.eventoRetorno = infoEventoRetorno;
    }

    public CTeEventoRetorno getEventoRetorno() {
        return eventoRetorno;
    }
}
