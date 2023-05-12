package entidades;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getNome().equals(produto.getNome())) {
                p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
                return;
            }
        }
        produtos.add(produto);
    }

    public void remover(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getNome().equals(nome)) {
                p.decrementarQuantidade();
                System.out.println("Um item desse produto foi removido!");
                if (p.getQuantidade() == 0) {
                    produtos.remove(i);
                    System.out.println("Produto foi totalmente removido do carrinho!");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public void exibirProdutos() {
    	if(produtos.isEmpty()) {
    		System.out.println("Este produto não existe no carrinho!!!");
    	}else {
    		for (Produto produto : produtos) {
                System.out.println(produto);
            }
    	}
        
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
