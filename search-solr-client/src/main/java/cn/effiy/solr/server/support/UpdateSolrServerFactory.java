package cn.effiy.solr.server.support;

import cn.effiy.solr.server.SolrServerFactoryBase;
import cn.effiy.solr.server.config.SolrServerConfig;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.ConcurrentUpdateSolrServer;

/**
 * Created by chengliang on 2015/8/25.
 */
public class UpdateSolrServerFactory extends SolrServerFactoryBase {
    @Override
    public SolrServer getSolrServer() {
//        ConcurrentUpdateSolrServer solrServer = new ConcurrentUpdateSolrServer(core,)
        return null;
    }

    public UpdateSolrServerFactory(){}

    public UpdateSolrServerFactory(String core, SolrServerConfig conf) {
        this.core = core;
        this.conf = conf;
    }

    private String core;

    private SolrServerConfig conf;
}
