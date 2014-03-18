package br.com.estudo.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import br.com.estudo.lang.DaoException;

/**
 * Interface que representa o objeto de acesso a dados.
 * @param <T> O tipo gen�rico do DAO.
 * @param <ID>
 */
public interface GenericDao <T, ID extends Serializable> {

        /**
         * Obter a classe do objeto.
         * @return a classe do objeto.
         */
        public Class<T> getObjectClass();
        
        /**
         * Persiste o objeto no banco de dados.
         * @param object o objeto que ser� persistido.
         * @return o objeto atualizado.
         * @throws DaoException 
         */
        public T save(T object) throws DaoException;
        
        /**
         * Persiste o objeto no banco de dados.
         * @param object o objeto que ser� persistido.
         * @return o objeto atualizado.
         * @throws DaoException 
         */
        public T merge(T object) throws DaoException;
        
        /**
         * Pesquisa o objeto pelo c�digo.
         * @param id o c�digo do objeto que ser� pesquisado.
         * @return o modelo pesquisado no banco de dados.
         * @throws DaoException 
         */
        public T searchById(ID id) throws DaoException;
        
        /**
         * Atualiza o objeto no banco de dados.
         * @param object o objeto que ser� atualizado.
         * @return o objeto atualizado.
         * @throws DaoException 
         */
        public T update(T object) throws DaoException;
        
        /**
         * Remove o objeto no banco de dados.
         * @param object o objeto a ser remove no banco de dados.
         * @throws DaoException 
         */
        public void delete(T object) throws DaoException;
        
        /**
         * Obt�m todos os objetos persistidos.
         * @return o conjunto de objetos no banco de dados.
         * @throws DaoException 
         */
        public List<T> all() throws DaoException;
        
        /**
         * Obt�m um conjunto de objetos pesquisado pela query passada pelo par�metro.<br />
         * Dever�o ser passados os par�metros para a query atrav�s de um {@link Map}.
         * @param query a query para a pesquisa no banco de dados.
         * @param params os par�metros para a query.
         * @return o conjunto de objetos resultado da pesquisa.
         * @throws DaoException 
         */
        public List<T> listSearchParam(String query, Map<String, Object> params) throws DaoException;
        
        /**
         * Obt�m um conjunto de objetos pesquisado pela query passada pelo par�metro.<br />
         * Dever�o ser passados os par�metros para a query atrav�s de um {@link Map}.<br />
         * Neste m�todo, h� a possibilidade informar o m�ximo de resultados e o resultado corrente.
         * @param query a query para a pesquisa no banco de dados.
         * @param params os par�metros para a query.
         * @param maximum o m�ximo de resultados.
         * @param current o resultado corrente.
         * @return o conjunto de objetos resultado da pesquisa.
         * @throws DaoException 
         */
        public List<T> listSearchParam(String query, Map<String, Object> params, int maximum, int current) throws DaoException;
        
        /**
         * Obt�m um conjunto de objetos pesquisado pela query passada pelo par�metro.
         * @param query a query para a pesquisa no banco de dados.
         * @return o conjunto de objetos resultado da pesquisa.
         * @throws DaoException 
         */
        public List<T> listSearch(String query) throws DaoException;
        
        /**
         * Obt�m o objeto resultante da query passada pelo par�metro.
         * @param query a query para a pesquisa no banco de dados.
         * @param params os par�metros para a query.
         * @return o objeto resultado da pesquisa.
         * @throws DaoException 
         */
        public T searchParam(String query, Map<String, Object> params) throws DaoException;

        /**
         * For�a para a sess�o deste flush. Deve ser chamado no final de uma unidade
         * de trabalho, antes de confirmar a opera��o e fechar a sess�o (dependendo do modo
         * flush, Transaction.commit () chama este m�todo).
         * @throws DaoException 
         */
        void flush() throws DaoException;

        /**
         * Carrega o objeto persistido na base de dados.
         * @param object O objeto que ser carregado.
         * @return O objeto da base de dados.
         * @throws DaoException
         */
        T load(T object) throws DaoException;
}