package com.amaze.filemanager.services.ssh;

import net.schmizz.sshj.sftp.SFTPClient;

import java.io.IOException;

public abstract class SFtpClientTemplate<T>
{
    public final String url;

    public final boolean closeClientOnFinish;

    public SFtpClientTemplate(String url)
    {
        this(url, true);
    }

    public SFtpClientTemplate(String url, boolean closeClientOnFinish)
    {
        this.url = url;
        this.closeClientOnFinish = closeClientOnFinish;
    }

    public abstract T execute(SFTPClient client) throws IOException;
}
