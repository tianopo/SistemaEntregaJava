import com.senac.entregas.controller.ClienteController;
import com.senac.entregas.controller.MotoboyController;
import com.senac.entregas.controller.PedidoController;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntregasControllerTest {

    @Test
    public void testHome() {
        PedidoController controller = new PedidoController();
        Model model = new ModelStub();

        String result = controller.pedido(model);

        assertEquals("index", result);
        assertEquals("pedidos", model.getAttribute("pagina"));
    }

    @Test
    public void testMotoboy() {
        MotoboyController controller = new MotoboyController();
        Model model = new ModelStub();

        String result = controller.motoboy(model);

        assertEquals("index", result);
        assertEquals("motoboy", model.getAttribute("pagina"));
    }

    @Test
    public void testCliente() {
        ClienteController controller = new ClienteController();
        Model model = new ModelStub();

        String result = controller.cliente(model);

        assertEquals("index", result);
        assertEquals("cliente", model.getAttribute("pagina"));
    }

    // Stub de Model para os testes
    private static class ModelStub implements Model {
        private Object attribute;

        @Override
        public Model addAttribute(String attributeName, Object attributeValue) {
            this.attribute = attributeValue;
            return this;
        }

        @Override
        public Model addAttribute(Object attributeValue) {
            return this;
        }

        public Model addAllAttributes(Model model) {
            return this;
        }

        @Override
        public Model addAllAttributes(java.util.Map<String, ?> map) {
            return this;
        }

        @Override
        public Model mergeAttributes(java.util.Map<String, ?> map) {
            return this;
        }

        @Override
        public boolean containsAttribute(String attributeName) {
            return false;
        }

        @Override
        public java.util.Map<String, Object> asMap() {
            return null;
        }

        @Override
        public Object getAttribute(String attributeName) {
            return this.attribute;
        }

        @Override
        public Model addAllAttributes(Collection<?> attributeValues) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
