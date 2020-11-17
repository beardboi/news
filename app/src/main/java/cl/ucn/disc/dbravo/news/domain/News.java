/*
 * Copyright 2020 Diego Bravo B
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *  and associated documentation files (the "Software"), to deal in the Software without
 *  restriction, including without limitation the rights to use, copy, modify, merge, publish,
 *  distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom
 *  the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 *  substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 *  BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dbravo.news.domain;

import org.threeten.bp.ZonedDateTime;

/**
 * The domain model: News
 *
 * @author Diego Bravo B
 */
public class News {
    /**
     * Unique id
     */
    private Long id;
    /**
     * The new's title
     * Restriction: not null, size > 2
     */
    private String title;
    /**
     * The author of the new
     */
    private String author;
    /**
     * The description of the new
     */
    private String description;
    /**
     * The content of the new
     */
    private String content;
    /**
     * The url of the new
     */
    private String url;
    /**
     * The url of the image
     */
    private String urlImg;
    /**
     * The date of publish
     */
    private ZonedDateTime publishedAt;

    /**
     * The constructor
     *
     * @param id          The id
     * @param title       The title
     * @param author      The author of the new
     * @param description The description of the new
     * @param content     The content of the new
     * @param url         The url of the new
     * @param urlImg      The url of the image
     * @param publishedAt The date of the new
     */
    public News(Long id, String title, String author, String description, String content, String url, String urlImg, ZonedDateTime publishedAt) {
        // TODO: Add the validation
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.content = content;
        this.url = url;
        this.urlImg = urlImg;
        this.publishedAt = publishedAt;

    }

    /**
     * This function return a string with the attributes of an instance object
     *
     * @return The string with the attributes
     */
    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", urlImg='" + urlImg + '\'' +
                ", publishedAt=" + publishedAt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public ZonedDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(ZonedDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }
}
