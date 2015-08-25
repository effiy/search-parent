package cn.effiy.solr.server;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.ConcurrentUpdateSolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.impl.LBHttpSolrServer;

/**
 * Created by chengliang on 2015/8/25.
 */
public abstract class SolrServerFactoryBase implements SolrServerFactory {

    protected void destroy(SolrServer solrServer) {
        if ((solrServer instanceof HttpSolrServer)) {
            ((HttpSolrServer) solrServer).shutdown();
        } else if ((solrServer instanceof LBHttpSolrServer)) {
            ((LBHttpSolrServer) solrServer).shutdown();
        } else if ((solrServer instanceof ConcurrentUpdateSolrServer)) {
            ((ConcurrentUpdateSolrServer) solrServer).shutdown();
        }
    }

    public void destroy() {
        destroy(this.solrServer);
    }

    public SolrServerFactoryBase() {
    }

    SolrServerFactoryBase(SolrServer solrServer) {
        this.solrServer = solrServer;
    }

    private SolrServer solrServer;
}
