package cn.effiy.solr.server;

import org.apache.solr.client.solrj.SolrServer;

/**
 * Solr Server 接口类
 * Created by chengliang on 2015/8/25.
 */
public abstract interface SolrServerFactory {
    public abstract SolrServer getSolrServer();
}
